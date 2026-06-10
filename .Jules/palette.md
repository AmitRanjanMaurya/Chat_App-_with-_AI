## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2026-06-10 - Disabling Empty Send Button
**Learning:** Users can click Send with empty prompts if the button isn't disabled, leading to confusing blank submissions.
**Action:** Ensure interactive UI elements (like IconButton) are visually disabled when their actions are invalid (e.g., submitting an empty form) to provide clear, immediate user feedback.
