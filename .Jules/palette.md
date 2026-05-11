## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-25 - Enhanced TextField Keyboard Options
**Learning:** By default, Android software keyboards do not present a contextual action key (like "Send" or "Done") or auto-capitalize sentences unless explicitly configured in the `TextField`.
**Action:** Always provide `KeyboardOptions` (e.g., `imeAction = ImeAction.Send`, `capitalization = KeyboardCapitalization.Sentences`) and wire up `KeyboardActions` on `TextField`s to improve the software keyboard UX and allow users to submit forms/messages seamlessly without moving their hands off the keyboard.
