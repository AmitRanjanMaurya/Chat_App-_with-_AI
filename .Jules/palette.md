## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled State Tinting in Jetpack Compose IconButton
**Learning:** When an `IconButton` contains an `Icon` with a hardcoded `tint` (e.g., `MaterialTheme.colorScheme.primary`), simply setting `enabled = false` on the `IconButton` does not automatically update the visual color of the inner `Icon` to appear disabled.
**Action:** When conditionally disabling an `IconButton` that uses a custom `tint` for its `Icon`, always dynamically update the `tint` parameter to visually reflect the disabled state (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` when `enabled` is false).
