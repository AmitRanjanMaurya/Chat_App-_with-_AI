## 2024-06-25 - Jetpack Compose Icon Buttons
**Learning:** Using `Icon` with `Modifier.clickable` creates interactive elements that lack proper minimum touch targets (48x48dp) and clear focus semantics, making them less accessible. They also may not provide consistent visual feedback like ripple effects out of the box.
**Action:** Always prefer the built-in `IconButton` component when creating icon-only buttons in Jetpack Compose to ensure built-in accessibility constraints and visual feedback are maintained.
