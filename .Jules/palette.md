## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabling IconButtons with Custom Tints in Jetpack Compose
**Learning:** Hardcoded custom tints in Jetpack Compose do not automatically reflect disabled states when the `enabled` parameter is changed on an `IconButton`.
**Action:** Always dynamically adjust the `tint` of the `Icon` inside the `IconButton` (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) when using a custom tint alongside the `enabled` parameter to ensure the disabled state is visually communicated.
