## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-07-12 - Accessible Disabled State for IconButton in Jetpack Compose
**Learning:** When disabling an `IconButton` in Jetpack Compose, the built-in properties do not automatically update the visual appearance if the inner `Icon` uses a hardcoded custom tint (e.g., `MaterialTheme.colorScheme.primary`).
**Action:** When manually setting an `IconButton`'s `enabled` property based on state, dynamically adjust the inner `Icon`'s `tint` parameter (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` when disabled) to provide clear, immediate visual feedback to the user that the action is unavailable.
