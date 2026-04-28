## 2024-05-09 - Replace clickable Icon with IconButton for accessibility
**Learning:** In Jetpack Compose, using `Modifier.clickable` directly on an `Icon` lacks proper accessibility features like minimum touch targets, focus semantics, and visual feedback (e.g., ripple effect). `IconButton` is designed specifically to wrap icons, providing these necessary features automatically.
**Action:** Always prefer `IconButton` when making standalone icons interactive to ensure a robust and accessible UX.
