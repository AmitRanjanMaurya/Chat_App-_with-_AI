## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Software Keyboard Actions and Disabled States in Compose
**Learning:** Text input fields in Compose should proactively configure `KeyboardOptions` (like `ImeAction.Send`) and `KeyboardActions` to provide an intuitive software keyboard experience. Additionally, explicitly tracking interactive states (like disabling empty form submissions while considering image attachments) and visually dampening disabled icons ensures accessible user feedback.
**Action:** Always map software keyboard actions to primary submission flows and ensure related UI buttons disable correctly with visual indicators when their actions are invalid.
