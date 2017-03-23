#!/usr/bin/env bash

# simple solution
cat input.txt | tr ' ' '\n' | sort | uniq -c | sort -r

# strong solution
cat input.txt | tr -cs "[:alpha:]" "\n" | sort | uniq -c | sort -r
