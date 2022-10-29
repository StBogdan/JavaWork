
# Java Leetcode Helper

Features for an easy CLI:

- Generate test file: `Problem9999.java`
- Generate code file: `Problem9999test.java`
- Generate file header
- Generate README table entry
- [Advanced] Generate tests from leetcode helper tests

Entry point is the terminal running the binary with the arguments.

Arguments should be the problem name and/or number:

- Both:
  - With params:

    ```shell
    > javacli --name "Title of LC problem" --number 1234 --type LC
    ```
  - Raw title:

    ```shell
    > javacli --rawtitle "1234. Title of LC problem"
    ```

- Number only or name only
  - TODO: Check GraphQL query for required input
