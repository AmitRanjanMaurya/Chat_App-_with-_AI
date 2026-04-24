
## 2024-05-18 - Jetpack Compose Icon Accessibility
**Learning:** Using `Icon` with `Modifier.clickable` creates interactive elements that lack crucial accessibility features out-of-the-box, such as proper focus semantics, minimum touch target sizes (48x48dp per Material Design), and visual interaction feedback (ripple effect).
**Action:** Always prefer the built-in `IconButton` component for icon-only buttons instead of adding `Modifier.clickable` to a raw `Icon`. `IconButton` automatically handles touch target sizes, semantics, and ripples.
