package pugilist_steve.mod.annoying_villagersbychentu.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)

public class BluesparkParticle extends TextureSheetParticle {
    private final SpriteSet spriteSet;

    protected BluesparkParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        this.setSize(0.3f, 0.2f);
        this.quadSize *= 0.2f;
        this.lifetime = Math.max(1, 16 + (this.random.nextInt(20) - 10));
        this.gravity = 0.4f;
        this.hasPhysics = true;
        this.xd = vx;
        this.yd = vy;
        this.zd = vz;
        this.pickSprite(spriteSet);
    }

    public static BluesparkParticleProvider provider(SpriteSet spriteSet) {
        return new BluesparkParticleProvider(spriteSet);
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
    }

    public static class BluesparkParticleProvider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public BluesparkParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }


        @Override
        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new BluesparkParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}
