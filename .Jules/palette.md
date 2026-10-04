## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-10-04 - Disabling invalid action states correctly
**Learning:** When disabling action buttons (like Send) to prevent invalid submissions, ensure all valid combinations are considered. For chat interfaces, an empty text field is valid if an image is attached.
**Action:** Always check all related state variables (e.g., `text.isNotBlank() || image != null`) when calculating the `enabled` state of a submit button to prevent blocking valid user actions.
