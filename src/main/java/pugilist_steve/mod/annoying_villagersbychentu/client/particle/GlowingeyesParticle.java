package pugilist_steve.mod.annoying_villagersbychentu.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)

public class GlowingeyesParticle extends TextureSheetParticle {
    private final SpriteSet spriteSet;
    private float angularVelocity;
    private final float angularAcceleration;

    protected GlowingeyesParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        this.setSize(0.0f, 0.0f);
        this.quadSize *= 1.7f;
        this.lifetime = 1;
        this.gravity = 0.0f;
        this.hasPhysics = false;
        this.xd = vx * 0.0d;
        this.yd = vy * 0.0d;
        this.zd = vz * 0.0d;
        this.angularVelocity = 0.1f;
        this.angularAcceleration = 0.0f;
        this.pickSprite(spriteSet);
    }

    public static GlowingeyesParticleProvider provider(SpriteSet spriteSet) {
        return new GlowingeyesParticleProvider(spriteSet);
    }

    @Override
    public int getLightColor(float partialTick) {
        return 15728880;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_LIT;
    }

    @Override
    public void tick() {
        super.tick();
        this.oRoll = this.roll;
        this.roll += this.angularVelocity;
        this.angularVelocity += this.angularAcceleration;
    }

    public static class GlowingeyesParticleProvider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public GlowingeyesParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }


        @Override
        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new GlowingeyesParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}
