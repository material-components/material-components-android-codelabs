These are tools we use to help manage the branches of the codelab

Because each codelab inherits changes from the previous codelabs we have these tools to rebase the branches.

`codelabs-evolve` can be run after committing a change to a branch to let the new codelabs inherit those changes. Continue to run evolve and check the output by building the app to ensure the changes that you expect to see are propogating correctly. It's possible if there are conflicting changes to run into problems. In some cases rebase can include some extra commits that it doesn't need to. Make sure to remove those when the rebase is performed.

`codelabs-sync` will pull in any changes from origin and move your changes on top. This should be run before pushing code to ensure you don't overwrite changes that might have been pushed since your last sync.

`codelabs-push` will force push all your branches to origin. Be sure you aren't overriding changes that might have been pushed while you were working. A good way to check is to run `git fetch`, and `git diff 101-starter origin/101-starter` for each branch to ensure you only see the differences you expect to see. If there are other unrelated changes, you might have to run `codelabs-sync` and `codelabs-evolve` again before pushing your changes.

Tip: `gitk --all` is a useful tool to see the branches for debugging.