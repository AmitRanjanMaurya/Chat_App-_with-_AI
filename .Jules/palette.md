## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Empty State & Keyboard UX
**Learning:** Preventing invalid states like sending an empty prompt by disabling the Send button provides immediate feedback and prevents useless network calls or errors. Furthermore, enhancing text input with `KeyboardCapitalization.Sentences` drastically improves the mobile typing experience.
**Action:** Always ensure that action buttons reflect their valid state visually (using `alpha = 0.38f` for disabled icons if needed) and that `TextField` components are configured with appropriate `KeyboardOptions`.
