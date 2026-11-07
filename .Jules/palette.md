## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disable Send Button When Input is Empty
**Learning:** Disabling the send button prevents invalid actions such as sending empty messages. When doing this in Jetpack Compose, the `IconButton` does not automatically update the visual tint of a customized inner `Icon`. The `tint` must be dynamically evaluated based on the `enabled` state.
**Action:** Ensure interactive components accurately reflect their state and dynamically adjust their visual properties to match the disabled visual state when custom tints are used.
