## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-06-03 - Software Keyboard UX in Jetpack Compose
**Learning:** By default, Jetpack Compose `TextField` inputs lack intuitive software keyboard actions (like a 'Send' button instead of 'Return'), which disrupts flow in chat-like applications.
**Action:** Always configure `KeyboardOptions` with appropriate `ImeAction` (e.g., `ImeAction.Send`) and handle the action via `KeyboardActions` (including hiding the keyboard with `LocalSoftwareKeyboardController`) to provide a seamless mobile typing experience.
