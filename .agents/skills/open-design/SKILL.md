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
3. **Execution Standards**:
   - Never use bland default colors (use curated tokens like `--primary: #00e699`, `--bg-surface: #121824`).
   - Integrate with React JSX components in `public/src/components/` seamlessly.
   - Support dark mode by default with vibrant gaming / cyberpunk neon accents.
