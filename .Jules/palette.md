## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-10-25 - Disabling IconButtons & Keyboard Actions in Compose
**Learning:**
1. When disabling an `IconButton` in Jetpack Compose, dynamically adjusting the inner `Icon`'s `tint` parameter is necessary for correct visual state, as hardcoded custom tints don't fade automatically.
2. Enhancing `TextField` UX requires configuring `KeyboardOptions` (like `ImeAction.Send` and `KeyboardCapitalization.Sentences`) and `KeyboardActions` to ensure intuitive software keyboard interactions.
**Action:** Ensure interactive UI elements are visually disabled when invalid (like empty forms), and always configure keyboard IME actions for text fields meant for immediate submission.
