These are tools we use to help manage the branches of the codelab

The way these tools are written, they will need to be updated if a new codelab is ever added.

The workflow is to run codelabs-mark before any commits, or amends. After the code has been changed codelabs-evolve can be run to move all the codelab branches on the correct locations. If there is a merge conflict, you just need to deal with the merge conflict, continue the rebase and run codelabs-evolve again. After you have made changes you are happy with, you can run codelabs-push to force push all the branches to origin.
