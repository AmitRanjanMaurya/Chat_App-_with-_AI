## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-10-24 - Visually Disabling IconButtons in Jetpack Compose
**Learning:** When overriding the default `tint` of an `Icon` inside an `IconButton`, setting `enabled = false` on the parent button does not automatically update the `Icon`'s color to reflect the disabled state. This can leave the button looking active even when disabled, which is confusing UX.
**Action:** Always dynamically adjust the `tint` of the inner `Icon` based on the enabled state (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` for disabled) when overriding the default tint.
