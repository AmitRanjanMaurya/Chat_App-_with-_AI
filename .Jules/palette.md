## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled State Visual Feedback
**Learning:** Ensuring interactive UI elements are visually disabled when actions are invalid (like empty prompts) provides immediate user feedback and improves overall UX.
**Action:** Always verify `enabled` states are visually distinct using updated `tint` or colors in `IconButton` and `Icon` components.
