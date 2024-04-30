package pugilist_steve.mod.annoying_villagersbychentu.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)

public class PeParticle extends TextureSheetParticle {
    private final SpriteSet spriteSet;

    protected PeParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        this.setSize(0.3f, 0.3f);
        this.quadSize *= 1.7f;
        this.lifetime = Math.max(1, 60 + (this.random.nextInt(10) - 5));
        this.gravity = 0.0f;
        this.hasPhysics = false;
        this.xd = vx * 0.0d;
        this.yd = vy * 0.0d;
        this.zd = vz * 0.0d;
        this.setSpriteFromAge(spriteSet);
    }

    public static PeParticleProvider provider(SpriteSet spriteSet) {
        return new PeParticleProvider(spriteSet);
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
        if (!this.removed) {
            this.setSprite(this.spriteSet.get(((this.age) % 27) + 1, 27));
        }
    }

    public static class PeParticleProvider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public PeParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }


        @Override
        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new PeParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}
