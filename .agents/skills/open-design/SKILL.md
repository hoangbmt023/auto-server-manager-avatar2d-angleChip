---
name: open-design
description: OpenDesign workspace and visual design engine for generating modern UI prototypes, live dashboards, slide decks, and styled components based on DESIGN.md.
---

# OpenDesign Engine for Avatar 2D Bot Manager

This skill activates OpenDesign capabilities within Antigravity, turning user briefs into high-fidelity UI designs, React/HTML prototypes, and presentation decks matching the project's design system.

## When to use this skill
- Whenever the user asks to design, style, revamp, or build a new UI component, modal, or dashboard for the Avatar 2D CPanel.
- When creating slides, infographics, or demo assets for project defense/reports.
- When standardizing color palettes, CSS variables, and typography according to `DESIGN.md`.

## OpenDesign Design Workflow
1. **Read Brand Contract**: Always refer to [DESIGN.md](file:///c:/Users/hoang/Downloads/test-cpanel-avatar/DESIGN.md) for color tokens, typography, glassmorphism, and component hierarchy.
2. **Artifact Types**:
   - **Live Dashboards & CPanel**: Real-time worker monitoring, bot activity matrix, stats indicators with pulse animations.
   - **Modals & Setup**: Polished glassmorphic dialogues with smooth inputs and micro-animations.
   - **Decks / Slides**: Swiss-grid or magazine-style presentation slides for project demo.
3. **Execution Standards & Strict Front-End Rules**:
   - **ZERO INLINE STYLES IN JSX (ABSOLUTE MANDATORY)**: Strictly NEVER write inline styles (`style={{ ... }}`) inside JSX or React components. No inline flexbox, gaps, margins, paddings, colors, borders, font sizes, or alignment. Every single visual rule MUST be authored as semantic CSS classes inside modular stylesheets (`public/style.css`, `user-dashboard.css`, `modals.css`, `navbar.css`, `dialog.css`), leveraging Apple Liquid Glass & Porsche design tokens (`var(--...)`). The only exceptional allowance is pure dynamic runtime data coordinates/percentages (e.g., progress bar `style={{ width: `${percent}%` }}`).
   - **NO RAW EMOJI ICONS (MANDATORY)**: Strictly NEVER use raw emojis or default Unicode icons (such as `✅`, `🎲`, `📋`, `✓`, `🔄`, `🔍`, `👁️`, `⚠️`) in the UI. Always use the vector SVG component `<window.Icon name="..." size={...} color="..." />` from `Icons.jsx`. Never add `xmlns="http://www.w3.org/2000/svg"` inside SVG tags to prevent mobile browser tap/long-press preview popups.
   - **CSS Hygiene & Modals**: All CSS must be declared in modular stylesheets (`modals.css`, `style.css`), never polluted across component markup. Verify matching braces `{}` carefully to avoid breaking stylesheet layouts.
   - **Centralized Formatters & Utils (MANDATORY)**: Never write ad-hoc or duplicated formatting functions (e.g. `formatMoney`, `formatNumber`, `toLocaleDateString`, `toLocaleString`) directly inside UI components. Always use the centralized utility module `window.formatters` (`public/src/utils/formatters.js`), ensuring:
     + Strict dot (`.`) thousands separators for all money (`formatMoney(val, withSuffix)`) and quantities (`formatNumber(val)`), never comma (`,`).
     + Standardized date and time formatting (`formatDateTime`, `formatDate`, `formatTime`, `formatRelativeTime`, `formatExpiration`).
     + Consistent voucher and discount labels (`formatVoucherDiscount`).
   - **Mobile UX First**: All data tables and modals must provide responsive card layouts on mobile viewports (< 768px), preventing clipped text or horizontal overflow.
   - Never use bland default colors (use curated tokens like `--primary: #00e699`, `--bg-surface: #121824`).
   - Integrate with React JSX components in `public/src/components/` seamlessly.
   - Support dark mode by default with vibrant gaming / cyberpunk neon accents.
