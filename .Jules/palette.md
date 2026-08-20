## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-25 - TextField Keyboard Integrations and Dynamic State UX
**Learning:** TextFields without proper KeyboardOptions and explicit disabled states for associated action buttons can lead to confusion and unnecessary interactions. Users expect standard IME actions (like 'Send') and immediate visual feedback when an action is unavailable.
**Action:** Always configure `KeyboardOptions` with appropriate capitalization and `ImeAction`, and ensure associated action buttons dynamically disable and visually grey out (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) when the input is invalid.
