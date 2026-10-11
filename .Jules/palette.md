## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-10-11 - Disabling Actions based on State Validation in Jetpack Compose
**Learning:** Providing immediate visual feedback by disabling action buttons (like a Send button) when input is invalid (e.g. empty) prevents user confusion and unnecessary errors. Custom colored icons in disabled `IconButton`s must have their `tint` manually adjusted to reflect the disabled state (e.g. using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`).
**Action:** Always bind the `enabled` parameter of interactive components to the relevant state validation logic and explicitly handle colors for disabled states if custom colors are used.
