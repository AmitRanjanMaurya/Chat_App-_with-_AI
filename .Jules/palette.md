## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled State Accessibility
**Learning:** When disabling an IconButton in Jetpack Compose, the inner Icon's tint parameter does not automatically reflect the disabled visual state if it was hardcoded to a custom color, requiring dynamic adjustment (e.g., using 38% alpha) to provide clear, immediate user feedback.
**Action:** Ensure interactive UI elements are visually disabled when their actions are invalid (like submitting an empty form) by dynamically updating the tint of inner components.
