## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2026-05-19 - Dynamic Tints for Disabled Compose Icons
**Learning:** When you provide a custom `tint` color to an `Icon` inside an `IconButton` in Jetpack Compose, the `Icon` no longer automatically changes color to reflect the `IconButton`'s disabled state.
**Action:** When adding a custom `tint` to an interactive `Icon`, make sure to dynamically adjust the color to visually indicate its `enabled` state (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` for disabled).
