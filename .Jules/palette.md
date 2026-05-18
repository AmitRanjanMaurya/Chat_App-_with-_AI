## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.## 2026-05-18 - Keyboard Actions UX in Compose
**Learning:** Users often instinctively tap the 'Enter/Return' key on mobile keyboards to send messages, but Jetpack Compose TextFields default to newlines. Adding  and  is a crucial micro-UX improvement.
**Action:** When working with forms or chat inputs in Compose, explicitly configure  (like ) and map the  (like ) to the submission logic to bridge the gap between software keyboard intent and application action.
## 2026-05-18 - Keyboard Actions UX in Compose
**Learning:** Users often instinctively tap the 'Enter/Return' key on mobile keyboards to send messages, but Jetpack Compose TextFields default to newlines. Adding KeyboardOptions and KeyboardActions is a crucial micro-UX improvement.
**Action:** When working with forms or chat inputs in Compose, explicitly configure keyboardOptions (like ImeAction.Send) and map the keyboardActions (like onSend) to the submission logic to bridge the gap between software keyboard intent and application action.
