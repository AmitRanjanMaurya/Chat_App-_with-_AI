## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2026-06-03 - Compose IconButton Disabled Visuals
**Learning:** In Jetpack Compose, applying an `enabled` state to an `IconButton` correctly blocks interactions but does not automatically dim the inner `Icon` if it uses a custom `tint` parameter.
**Action:** When conditionally disabling an `IconButton` that specifies a custom `Icon` tint, ensure the `tint` logic dynamically switches to a disabled color (like `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to provide accurate visual feedback.
