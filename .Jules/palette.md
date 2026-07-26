## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled IconButton and Icon Tints in Jetpack Compose
**Learning:** When disabling an `IconButton` in Jetpack Compose, an inner `Icon` with a custom `tint` parameter will not automatically reflect the disabled visual state.
**Action:** Always dynamically adjust the `Icon`'s `tint` parameter (e.g., `if (enabled) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to match the expected visual state for users.
