## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.

## 2024-06-14 - Enhance TextField UX with KeyboardOptions
**Learning:** In Jetpack Compose, configuring `KeyboardOptions` (like `ImeAction.Send` and `KeyboardCapitalization.Sentences`) and `KeyboardActions` on a `TextField` significantly improves UX by ensuring intuitive software keyboard interactions. Also visually disabling an `IconButton` correctly requires dynamically adjusting its inner `Icon`'s `tint` parameter.
**Action:** Always configure software keyboard behaviors for forms and ensure interactive UI elements visually indicate their disabled state.
