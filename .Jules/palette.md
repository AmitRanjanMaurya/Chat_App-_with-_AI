## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-06-08 - Visually Disabling Action Buttons with Custom Tints in Compose
**Learning:** When using an `IconButton` in Jetpack Compose, setting the `enabled` parameter correctly disables interactions. However, if the inner `Icon` uses a hardcoded `tint` parameter, it overrides the default visual disabled styling.
**Action:** Always dynamically adjust the `tint` of the inner `Icon` (e.g., using `if (enabled) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to ensure the user receives immediate visual feedback that the action is not currently available.
