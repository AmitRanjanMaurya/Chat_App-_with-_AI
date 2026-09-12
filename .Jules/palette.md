## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-10-24 - Visual Disabled State in Compose
**Learning:** When disabling an `IconButton` in Jetpack Compose, dynamically adjust the inner `Icon`'s `tint` parameter (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`), as hardcoded custom tints do not automatically reflect the disabled visual state.
**Action:** Ensure interactive UI elements (like `IconButton`) are visually disabled when their actions are invalid (e.g., submitting an empty form) to provide clear, immediate user feedback.
