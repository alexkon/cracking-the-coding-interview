package chapter5.bit.manipulation.task8;


public class LineOnTheScreen {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;
        byte[] screen = new byte[rows * columns];

        printScreen(screen, rows, columns);

        drawLine(screen, 12, 19, 2, 32);

        printScreen(screen, rows, columns);
    }

    private static void printScreen(byte[] screen, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                byte b = screen[i * columns + j];
                String binaryString = String.format("%8s.", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
                System.out.print(binaryString);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void drawLine(byte[] screen, int x1, int x2, int y, int width) {


        int startOffset = x1 % 8;
        int firstFullByte = x1 / 8;
        if (startOffset != 0) {
            firstFullByte++;
        }

        int endOffset = x2 % 8;
        int endFullByte = x2 / 8;
        if (endOffset != 7 ) {
            endFullByte--;
        }

        // full first full byte
        for (int t = firstFullByte; t <= endFullByte; t++) {
            screen[width / 8 * y + t] = (byte)0xFF;
        }

        // create masks
        byte startMask = (byte) (0xFF >> startOffset);
        byte endMask = (byte)~(0xFF >> (endOffset + 1));

        // set first and end bytes
        if (x1 / 8 == x2 / 8) {
            byte startEndMask = (byte) (startMask & endMask);
            screen[(width / 8) * y + x1 / 8] |= startEndMask;
        } else {
            if (startOffset != 0) {
                int byteNumber = (width / 8) * y + firstFullByte - 1;
                screen[byteNumber] |= startMask;
            }
            if (endOffset != 7) {
                int byteNumber = (width / 8) * y + endFullByte + 1;
                screen[byteNumber] |= endMask;
            }
        }
    }
}
