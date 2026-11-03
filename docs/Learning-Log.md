# Learning-Log

This file chronologically documents the observations, challenges faced, learnings, solutions implemented, etc. for every version of the ChatBot till the latest version. I hope this helps others in understanding about the working of a chatbot in depth.

---

## v1 - Simple Chatbot

### Entry 1 - Initial Implementation (Java/Chatbot_Java_v1.java)
**Date:** 3/11/2026

**Concept:**
Regular expression matching using Java's `Pattern` and `Matcher` classes.

**Challenge:**
The chatbot returned unexpected responses because `matcher.find()` matched patterns within the input rather than checking the entire input and separating words.

<!-- **Investigation:**
Investigated the difference between `Matcher.find()` and `Matcher.matches()` and understood how each handles regex pattern matching. -->

**Solution:**
Replaced `matcher.find()` with `matcher.matches()` to ensure the entire user input matches a predefined regex pattern.

**Learning:**
matcher.matches() checks whether the regex pattern matches the entire user input, unlike matcher.find(), which searchers for matching substrings within the input.

---
<!-- //this is the template
### Entry 2 – Initial Implementation (Java)
**Date:** DD/MM/YYYY

**Concept:**
...

**Challenge:**
...

**Investigation:**
...

**Solution:**
...

**Learning:**
...

--- -->
