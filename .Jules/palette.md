## 2026-05-05 - Jetpack Compose Interactive Icons
**Learning:** For Jetpack Compose interactive components, prefer the built-in `IconButton` over an `Icon` with a `Modifier.clickable` to ensure proper accessibility (minimum touch targets, focus semantics) and visual feedback (ripple effect).
**Action:** Always use `IconButton` (or `IconToggleButton`) for clickable icons instead of manually adding click modifiers to `Icon` composables.
