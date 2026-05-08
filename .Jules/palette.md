## 2024-03-24 - Prefer IconButton over Icon with Modifier.clickable
**Learning:** For Jetpack Compose interactive components, prefer the built-in `IconButton` over an `Icon` with a `Modifier.clickable`. This ensures proper accessibility (minimum touch targets, focus semantics) and visual feedback (ripple effect).
**Action:** Always wrap `Icon` elements that perform an action in an `IconButton` instead of relying on custom click modifiers.
