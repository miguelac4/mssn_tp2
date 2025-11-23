# 🌌 MSSN – Solar System & Boid Behaviours

> Practical assignment for the course **Modelação e Simulação de Sistemas Naturais (MSSN)**  
> BSc in Computer Engineering and Multimedia – **ISEL**  
> Winter semester **2025 / 2026**

---

## 👥 Authors

- **Student:** Miguel Cordeiro — nº 49765 — LEIM31D  
- **Student:** João Valente — nº 51879 — LEIM31D  
- **Instructor:** Eng.º Arnaldo Abrantes  

---

## 📝 Project Overview

This practical work explores different **natural systems and agent behaviours** implemented in **Processing**, from gravitational motion to autonomous Boids.

In this document we present short **video demonstrations** of four main simulations:

1. **Solar System & Particle System**  
2. **Autonomous Agent – Boid with throttle and brake**  
3. **Autonomous Agent – Wander behaviour**  
4. **Group Behaviours – Flocking**  

Each video illustrates how simple physical laws and local rules can generate complex and visually rich dynamics.

---

## 🎥 Video Demos

### 1️. Solar System & Particle System

Video showing a simplified **solar system**, where each planet is modeled as a body with mass, position and velocity, updated using Newton’s law of universal gravitation.  
A small **particle system** (comets/fragments) is added to enrich the scene and highlight orbital motion.

<a href="https://youtu.be/gkh3Q7ATJTs" title="Watch Solar System on YouTube">
  <img src="media/thumb_dla.png" alt="Click the image to watch the Solar System demo" width="420">
</a>

---

### 2️. Boid with Throttle and Brake

Video of a single **Boid** controlled by the user:  
- **W** applies a forward thrust (accelerator)  
- **S** applies an opposite force (brake)  
- **Space** toggles between stop / resume  

The clip shows how the steering forces affect velocity and trajectory in real time.

<a href="https://youtu.be/gkh3Q7ATJTs" title="Watch Boid with Throttle and Brake on YouTube">
  <img src="media/thumb_dla.png" alt="Click the image to watch the Boid with Throttle and Brake demo" width="420">
</a>

---

### 3️. Wander Behaviour

Demo of the **Reynolds Wander** behaviour.  
The Boid follows a smoothly moving target on a virtual circle in front of it, producing an organic, unpredictable path without abrupt turns. Optional debug visuals show the wander circle and target point.

<a href="https://youtu.be/gkh3Q7ATJTs" title="Watch Wander Behaviour on YouTube">
  <img src="media/thumb_dla.png" alt="Click the image to watch the Wander Behaviour demo" width="420">
</a>

---

### 4️. Group Behaviours – Flocking

Video of a full **flocking system** based on Craig Reynolds’ model, including:  
- basic separation, alignment and cohesion  
- predator chasing the nearest prey  
- explosive boids with individual timers  
- leader-follower mode and debug boid with field of view  

The video illustrates the emergence of collective motion from simple local rules.

<a href="https://youtu.be/gkh3Q7ATJTs" title="Watch Flocking on YouTube">
  <img src="media/thumb_dla.png" alt="Click the image to watch the Flocking demo" width="420">
</a>
