## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Explicit Disabled Visuals and Sentences Capitalization
**Learning:** Hardcoded custom tints in Jetpack Compose's `IconButton` do not automatically reflect the disabled visual state. Also, standard `TextField`s lack automatic sentence capitalization without `KeyboardOptions`.
**Action:** Dynamically adjust the inner `Icon`'s `tint` parameter in an `IconButton` (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) when disabled. Additionally, always set `KeyboardOptions(capitalization = KeyboardCapitalization.Sentences)` in `TextField`s to enhance the software keyboard typing UX.
