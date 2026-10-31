## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-11-01 - Disabled states for IconButtons in Jetpack Compose
**Learning:** Hardcoded custom tints on `Icon` components inside an `IconButton` do not automatically update when the `IconButton` is disabled, leaving the user without visual feedback of the disabled state.
**Action:** Dynamically adjust the inner `Icon`'s `tint` parameter based on the enabled state (e.g., `if (enabled) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to ensure proper visual feedback.
