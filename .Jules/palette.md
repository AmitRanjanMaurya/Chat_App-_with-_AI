## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-25 - Software Keyboard Actions and Disabled States
**Learning:** In chat applications, failing to map the software keyboard's "Enter/Return" key to the primary action (Send) disrupts user flow, while failing to disable the send action visually when the input is empty can lead to confused states or accidental blank submissions.
**Action:** Always configure `keyboardOptions` (e.g., `ImeAction.Send`) and `keyboardActions` on text inputs. Additionally, clearly reflect disabled states visually on primary action buttons (like adjusting alpha to 0.38f) when prerequisites (like having text or an image attachment) are not met.
