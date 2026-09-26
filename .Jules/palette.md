## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2026-09-26 - Visual Feedback on Disabled Send Action
**Learning:** When disabling an `IconButton` in Jetpack Compose, dynamically adjust the inner `Icon`'s `tint` parameter (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`), as hardcoded custom tints do not automatically reflect the disabled visual state.
**Action:** Always verify if inner icons require dynamic tint logic when introducing an `enabled` state to custom tinted Interactive elements.
