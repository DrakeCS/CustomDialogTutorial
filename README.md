CustomEditTextDialog
====================
A brief example project to demonstrate using a custom Dialog to get and use textual information from a user.
Explained
---------

The **MainActivity** inflates a layout with one TextView and one Button. It also defines a method called `changeTeamName()` which is called when the activity's button is clicked.

The `changeTeamName()` method creates a custom Dialog object from *dialog_change_team_name.xml*, establishes affirmative and negative action buttons with their own `onClick()` listeners.
- Clicking the 'Cancel' button cancels the dialog and dismisses it.
- Clicking the 'Change' button gets the text out of the EditText in the Dialog and uses it to update the MainActivity's TextView.
