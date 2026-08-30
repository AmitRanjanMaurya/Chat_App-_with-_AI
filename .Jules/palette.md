## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Context-Aware Disabled States
**Learning:** Disabling submit buttons based solely on text input can create regressions if other input modalities (like image attachments) are present and valid on their own.
**Action:** Always evaluate the complete set of valid input states (e.g., text OR image) when determining if an action should be enabled, and ensure disabled visual states correctly reflect the disabled property.
