## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2026-06-05 - Tying Component States in Jetpack Compose
**Learning:** In Jetpack Compose, setting the `enabled` parameter of an `IconButton` prevents interaction but may not automatically adjust the inner `Icon`'s custom tint to reflect the disabled state visually.
**Action:** Always dynamically calculate the `tint` of inner `Icon` components based on the `enabled` state of their parent container (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` for disabled states) to ensure clear, immediate visual feedback.
