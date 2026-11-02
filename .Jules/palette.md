## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled State Styling in Jetpack Compose IconButtons
**Learning:** When an `IconButton` contains an `Icon` with a hardcoded `tint` (e.g. `MaterialTheme.colorScheme.primary`), the icon will not automatically gray out when the `IconButton`'s `enabled` state is set to `false`.
**Action:** Always dynamically adjust the `Icon`'s `tint` parameter based on the `enabled` state (e.g., `if (isEnabled) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to ensure proper visual feedback for disabled actions.
