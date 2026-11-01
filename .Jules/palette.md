## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2026-11-01 - Dynamic Tint for Disabled IconButtons
**Learning:** In Jetpack Compose, hardcoded custom tints on the `Icon` inside an `IconButton` do not automatically inherit or reflect the disabled visual state when the parent `IconButton` is disabled.
**Action:** Always dynamically adjust the `tint` parameter of the inner `Icon` (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) based on the same condition used for the `enabled` state of the `IconButton`.
