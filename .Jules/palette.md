## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-10-28 - Disable Submit Buttons for Invalid Form States
**Learning:** Users can be confused when they click a submit button (like sending a chat message) and nothing happens because the input is invalid (e.g., empty or blank prompt).
**Action:** Always visually disable action buttons (like Send) when their requirements are not met (e.g., input is blank), and adjust their visual styling (like icon tint) to clearly communicate their disabled state.
