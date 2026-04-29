## 2024-04-29 - Replace Icon clickable with IconButton
**Learning:** Using `Icon` with `Modifier.clickable` in Jetpack Compose lacks proper interaction feedback (like the ripple effect) and does not inherently enforce minimum touch target sizes or accessibility focus semantics compared to the standard `IconButton`.
**Action:** Prefer using the built-in `IconButton` component that wraps an `Icon` to ensure proper visual feedback, a 48x48dp minimum touch target, and appropriate semantics for accessible UI components.
