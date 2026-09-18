## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-25 - Robust Enablement States & Keyboard UX
**Learning:** Disabling an action button based only on text input incorrectly blocks valid alternative content like standalone images. Additionally, missing KeyboardOptions degrades the typing experience.
**Action:** When evaluating enablement states, always account for all valid payloads. Combine this with proper visual feedback (dimming disabled icons) and ImeAction configuration for seamless interactions.
