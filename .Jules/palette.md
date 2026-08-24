## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-25 - Disabling IconButtons with custom Icon tints
**Learning:** When providing a custom `tint` color to an `Icon` inside an `IconButton`, the icon does not automatically change to a disabled color when the `IconButton` is `enabled = false`.
**Action:** Always manually adjust the `tint` of the `Icon` based on the enabled state (e.g., using `if (enabled) customColor else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to ensure the user receives proper visual feedback for disabled actions.
