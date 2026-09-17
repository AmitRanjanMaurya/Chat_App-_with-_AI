## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Enhancing Jetpack Compose TextField UX
**Learning:** By default, a Jetpack Compose `TextField` does not capitalize sentences or hide the keyboard when the user presses 'Send' on their device's software keyboard.
**Action:** Always configure `TextField` elements using `KeyboardOptions` (e.g., `KeyboardCapitalization.Sentences`, `ImeAction.Send`) and `KeyboardActions` (using `LocalSoftwareKeyboardController.current` to hide it upon action) to ensure intuitive mobile interactions.
