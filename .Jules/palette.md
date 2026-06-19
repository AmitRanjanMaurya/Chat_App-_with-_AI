## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Visual Feedback for Invalid Actions
**Learning:** Users can be confused when an action button (like a "Send" button) appears interactive but clicking it does nothing due to an invalid state (e.g., empty form).
**Action:** Ensure interactive UI elements are visually disabled when their actions are invalid to provide clear, immediate user feedback.
